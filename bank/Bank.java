/*
 * 4 Access Modifiers In JAVA
 *  -   Public      [ Can be used within the whole class and also available for packages totally depends upon object ]
 *  -   Private     [ Only Accessible within the class ]
 *  -   Protected   [ Any class can access this in current package while in any other package only Sub Classes can access these ]
 *  -   Default     [ Auto declared when we dont place any access modifier in front of any class or func or attr ]
 */

package bank;

class Account {
    public String name;                   // Public 
    String type;                          // Default 
    protected String email;               // Protected
    private String password = "#123@#";   // Private


    // Getters and Setters To accesss and Modify the Private functions Outside the class boundary

    
    public void setPwd(String pwd) {
        this.password = pwd;
    } 
    public String getPwd() {
        return this.password;
    } 
}

public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Account1";
        account1.type = "Current Account";
        account1.email = "customer1@gmail.com";
        // account1.password = "jhbuial"; ---------------> Cannot Access this Directly

        account1.setPwd("Hello World");
        System.out.println(account1.getPwd());

    }
}
