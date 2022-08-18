public class Order {
    private long orderId;
    private double amount;

    public Order(long orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    @Override
    public boolean equals(Object o) {{
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    };

        return false;
    }}
