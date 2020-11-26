package com.zjy.sm.frame;

import com.zjy.sm.entity.AdminName;
import com.zjy.sm.entity.Department;
import com.zjy.sm.factory.ServiceFactory;

import javax.smartcardio.Card;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.List;

/**
 * @ClassName MainFrame
 * @Description TODO
 * @Author Z
 * @Date 2020/11/26
 **/

public class MainFrame extends JFrame {

    private JPanel mainPanel;
    private JPanel topPanel;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JPanel buttonPanel;
    private JButton collegeButton;
    private JButton classButton;
    private JButton rewardButton;
    private JButton studentButton;
    private JPanel centerPanel;
    private JPanel bodyPanel;
    private JPanel collegePanel;
    private JPanel classPanel;
    private JPanel rewardPanel;
    private JPanel studentPanel;
    private JPanel headPanel;
    private JButton addButton;
    private JButton refreshButton;

    public static void main(String[] args)
    {
        new MainFrame();
    }

    private void showDepartments() {
        collegePanel.removeAll();
        List<Department> departmentList = ServiceFactory.getDepartmentServiceInstance().selectAll();
        int len = departmentList.size();
        int row = len % 4 == 0 ? len / 4 : len / 4 + 1;
        GridLayout gridLayout = new GridLayout(row, 4, 10, 10);
        collegePanel.setLayout(gridLayout);
        for (Department department : departmentList) {
            JPanel depPanel = new JPanel();
            depPanel.setPreferredSize(new Dimension(200, 200));
            depPanel.setBorder(BorderFactory.createTitledBorder(department.getDepartmentName()));
            JLabel logoLabel = new JLabel("<html><img src='" + department.getLogo() + "' width='200' height='200'/></html>");
            depPanel.add(logoLabel);
            collegePanel.add(depPanel);
            collegePanel.revalidate();
        }
    }
    private final CardLayout c;
    public MainFrame() {
        //init();
        collegeButton.setOpaque(false);
        classButton.setOpaque(false);
        studentButton.setOpaque(false);
        rewardButton.setOpaque(false);

        Border border=new EmptyBorder(10, 10, 5, 10);
        addButton.setBorder(border);
        this.setTitle("MainFrame");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);

        c = new CardLayout();
        bodyPanel.setLayout(c);
        bodyPanel.add("1", collegePanel);
        bodyPanel.add("2", classPanel);
        bodyPanel.add("3", rewardPanel);
        bodyPanel.add("4", studentPanel);
        c.show(bodyPanel, "1");
        collegeButton.addActionListener(e -> {
            c.show(bodyPanel, "1");
        });
        classButton.addActionListener(e -> {
            c.show(bodyPanel, "2");
        });
        rewardButton.addActionListener(e -> {
            c.show(bodyPanel, "3");
        });
        studentButton.addActionListener(e -> {
            c.show(bodyPanel, "4");
        });
        showDepartments();
    }
}
