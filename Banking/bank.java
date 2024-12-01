public class bank {
    private void clearInputFields() {
        amountField.setText("");
        categoryDropdown.setSelectedIndex(0);
        dateDropdown.setSelectedIndex(0);
    }

    static class BackgroundPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();

            Color color1 = new Color(135, 206, 250);
            Color color2 = new Color(70, 130, 180);
            GradientPaint gp = new GradientPaint(0, 0, color1, 0, height, color2);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, width, height);
        }
    }

    static class Transaction {
        private String name;
        private double amount;
        private String category;
        private String date;

        public Transaction(String name, double amount, String category, String date) {
            this.name = name;
            this.amount = amount;
            this.category = category;
            this.date = date;
        }

        public String getName() {
            return name;
        }

        public double getAmount() {
            return amount;
        }

        public String getCategory() {
            return category;
        }

        public String getDate() {
            return date;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PersonalFinanceApp app = new PersonalFinanceApp();
            app.setVisible(true);
        });
    }
}
}
