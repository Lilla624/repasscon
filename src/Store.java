/*
* File: Store.java
* Author: Sallai András
* Copyright: 2024, Sallai András
* Refactored: Varga Lilla, 2025-01-04
* Group: szit
* Date: 2024-12-15
* Github: https://github.com/oktat/
* Licenc: MIT
*/

public class Store {
    
    String username;

    String password;
    
    String place;
    
    public Store(String username, String password, String place) {
        this.username = username;
        this.password = password;
        this.place = place;
    }

    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }

    public String getPlace() {
        return place;
    }
}
