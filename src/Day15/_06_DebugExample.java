package Day15;

public class _06_DebugExample {
    public static void main(String[] args) {
        // Programı adım adım çalıştırıp her satırdaki değerleri kontrol etmek
        // için başlamasını istediğimiz yere breakpoint (kırmızı nokta) konur.
        // RUN yerine DEBUG seçilerek çalıştırılır. Program ilk olarak breakpointte
        // durur ve F8 ile adım adım ilerletilir. Bu şekilde hem değerler izlenir
        // hem de nasıl çalıştığı test edilebilir. F9 ile bir break Pointten diğer
        // Break Pointe atlanabilir.
        
        int a=10;
        
        a=1000;
        
        a+=100;
        
        a+=5;

        System.out.println("a = " + a);
        
    }
}
