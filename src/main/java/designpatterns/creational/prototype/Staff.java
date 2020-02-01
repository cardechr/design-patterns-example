package designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Staff implements Cloneable {
    private List<String> staffNames;

    public Staff() {
        this.staffNames = new ArrayList<>();
        loadStaffNames();
    }

    private void loadStaffNames() {
        this.staffNames.add("Michael Buble");
        this.staffNames.add("Frank Sinatra");
        this.staffNames.add("Mile Davis");
        this.staffNames.add("Louis Armstrong");
    }

    public List<String> getStaffNames() {
        return this.staffNames;
    }

    public String findStaffByName(String name) {
        return this.staffNames.stream()
                .filter(x -> x.equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Staff copiedStaff = (Staff) super.clone();
        copiedStaff.staffNames.addAll(this.staffNames);
        return staffNames;
    }
}
