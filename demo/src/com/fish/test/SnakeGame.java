package com.fish.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class SnakeGame extends JFrame implements KeyListener {
    
    private static final long serialVersionUID = 1L;
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int UNIT_SIZE = 20;
    private static final int GAME_UNITS = (WIDTH * HEIGHT) / (UNIT_SIZE * UNIT_SIZE);
    private static final int DELAY = 100;
    
    private final int[] x = new int[GAME_UNITS];
    private final int[] y = new int[GAME_UNITS];
    
    private int bodyParts = 3;
    private int foodEaten;
    private int foodX;
    private int foodY;
    private char direction = 'R';
    private boolean running = false;
    private Timer timer;
    private Random random;
    private GamePanel gamePanel;
    
    public SnakeGame() {
        random = new Random();
        this.setTitle("贪吃蛇游戏");
        this.setSize(WIDTH, HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        gamePanel = new GamePanel();
        this.add(gamePanel);
        
        this.addKeyListener(this);
        this.setVisible(true);
        
        startGame();
    }
    
    public void startGame() {
        initSnake();
        newFood();
        running = true;
        timer = new Timer(DELAY, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (running) {
                    move();
                    checkFood();
                    checkCollisions();
                }
                gamePanel.repaint();
            }
        });
        timer.start();
    }
    
    private void initSnake() {
        bodyParts = 3;
        int startX = WIDTH / 2;
        int startY = HEIGHT / 2;
        for (int i = 0; i < bodyParts; i++) {
            x[i] = startX - i * UNIT_SIZE;
            y[i] = startY;
        }
    }
    
    public void move() {
        for (int i = bodyParts; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }
        
        switch (direction) {
            case 'U':
                y[0] = y[0] - UNIT_SIZE;
                break;
            case 'D':
                y[0] = y[0] + UNIT_SIZE;
                break;
            case 'L':
                x[0] = x[0] - UNIT_SIZE;
                break;
            case 'R':
                x[0] = x[0] + UNIT_SIZE;
                break;
        }
    }
    
    public void checkFood() {
        if ((x[0] == foodX) && (y[0] == foodY)) {
            bodyParts++;
            foodEaten++;
            newFood();
        }
    }
    
    public void checkCollisions() {
        for (int i = bodyParts; i > 0; i--) {
            if ((x[0] == x[i]) && (y[0] == y[i])) {
                running = false;
            }
        }
        
        if (x[0] < 0 || x[0] >= WIDTH || y[0] < 0 || y[0] >= HEIGHT) {
            running = false;
        }
        
        if (!running) {
            timer.stop();
        }
    }
    
    public void newFood() {
        foodX = random.nextInt((int) ((WIDTH - UNIT_SIZE) / UNIT_SIZE)) * UNIT_SIZE;
        foodY = random.nextInt((int) ((HEIGHT - UNIT_SIZE) / UNIT_SIZE)) * UNIT_SIZE;
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                if (direction != 'R') {
                    direction = 'L';
                }
                break;
            case KeyEvent.VK_RIGHT:
                if (direction != 'L') {
                    direction = 'R';
                }
                break;
            case KeyEvent.VK_UP:
                if (direction != 'D') {
                    direction = 'U';
                }
                break;
            case KeyEvent.VK_DOWN:
                if (direction != 'U') {
                    direction = 'D';
                }
                break;
            case KeyEvent.VK_ENTER:
                if (!running) {
                    foodEaten = 0;
                    direction = 'R';
                    startGame();
                }
                break;
        }
    }
    
    @Override
    public void keyReleased(KeyEvent e) {}
    
    @Override
    public void keyTyped(KeyEvent e) {}
    
    private class GamePanel extends JPanel {
        private static final long serialVersionUID = 1L;
        
        public GamePanel() {
            this.setBackground(Color.WHITE);
        }
        
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            if (running) {
                g.setColor(Color.RED);
                g.fillOval(foodX, foodY, UNIT_SIZE, UNIT_SIZE);
                
                for (int i = 0; i < bodyParts; i++) {
                    if (i == 0) {
                        g.setColor(Color.GREEN);
                    } else {
                        g.setColor(new Color(45, 180, 0));
                    }
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                }
                
                g.setColor(Color.BLACK);
                g.setFont(new Font("Arial", Font.BOLD, 24));
                FontMetrics metrics = getFontMetrics(g.getFont());
                g.drawString("分数: " + foodEaten, (WIDTH - metrics.stringWidth("分数: " + foodEaten)) / 2, 30);
            } else {
                g.setColor(Color.RED);
                g.setFont(new Font("Arial", Font.BOLD, 50));
                FontMetrics metrics = getFontMetrics(g.getFont());
                g.drawString("游戏结束", (WIDTH - metrics.stringWidth("游戏结束")) / 2, HEIGHT / 2 - 30);
                
                g.setColor(Color.BLACK);
                g.setFont(new Font("Arial", Font.BOLD, 24));
                metrics = getFontMetrics(g.getFont());
                g.drawString("分数: " + foodEaten, (WIDTH - metrics.stringWidth("分数: " + foodEaten)) / 2, HEIGHT / 2 + 20);
                g.drawString("按 ENTER 重新开始", (WIDTH - metrics.stringWidth("按 ENTER 重新开始")) / 2, HEIGHT / 2 + 60);
            }
        }
    }
    
    public static void main(String[] args) {
        new SnakeGame();
    }
}