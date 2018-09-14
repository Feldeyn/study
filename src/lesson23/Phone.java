package lesson23;

public class Phone {
    private int id;
    private int userId;
    private String phoneNumbers;

    public Phone(int id, int userId, String phoneNumbers) {
        this.id = id;
        this.userId = userId;
        this.phoneNumbers = phoneNumbers;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Phone phone = (Phone) o;

        if (id != phone.id) return false;
        if (userId != phone.userId) return false;
        return phoneNumbers != null ? phoneNumbers.equals(phone.phoneNumbers) : phone.phoneNumbers == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + userId;
        result = 31 * result + (phoneNumbers != null ? phoneNumbers.hashCode() : 0);
        return result;
    }
}
