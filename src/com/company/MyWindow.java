package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame { // JFrame это класс позволяющий создавать различные формы
    public MyWindow() { // Создали окно
        setLocation(500,250); // Задали локацию для окна
        setSize(500,400); // Создали размер окна

        GridLayout layout = new GridLayout(3,1); // Создали панель со строками и столбцами

        JPanel btnPanel = new JPanel(layout);

        JButton btn1 = new JButton("Главное меню"); // Создали кнопку
        btnPanel.add(btn1);

        btn1.addActionListener(new ActionListener() { // Задали функцию которую кнопка будет выполнять. Для этого нужно создать класс в котором будет реализация кнопки.
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        JButton btn2 = new JButton("Продолжить");
        btnPanel.add(btn2);

        JLabel label = new JLabel("Введите ваше Имя:"); // Название, например: текстового поля
        btnPanel.add(label);

        JTextField input = new JTextField(" ",5); // Создали текстовое поле
        btnPanel.add(input,BorderLayout.CENTER);


        add(btnPanel, BorderLayout.NORTH); // Панель с двумя кнопками поместили в верху окна

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Создали опцию окна, чтобы можно было его закрыть и выйти
        setVisible(true); // Делаем окно видимым
    }
}
