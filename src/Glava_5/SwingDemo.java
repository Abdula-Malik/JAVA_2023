package Glava_5;

import javax.swing.*;

class   SwingDemo {
    SwingDemo() {
// Создать  контейнер  JFrame.
        JFrame jfrm = new JFrame("A  Simple  Swing Application");
// Простое приложение  Swing
//Установить  начальные размеры  фрейма.
        jfrm.setSize(275, 100);
// Прекратить  работу,  когда пользователь  закрывает  приложение.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Создать  текстовую  метку.
        JLabel jlab = new JLabel("Swing means powerful GUis. ");
// Swing позволяет  строить мощные  графические пользовательские
// интерфейсы
// Добавить  метку  в  панель  содержимого.
        jfrm.add(jlab);
// Отобразить  фрейм.
        jfrm.setVisible(true);

    }
}
