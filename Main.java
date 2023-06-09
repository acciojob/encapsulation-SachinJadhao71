class Main{
    public static void main(String[] args) {
        RWOnly rwOnly = new RWOnly("sachin");

        System.out.println(rwOnly.name);

        rwOnly.setName("ajay");

        rwOnly.getName();
    }
}