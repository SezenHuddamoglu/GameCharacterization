public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
    /*void takeDamage(int damage); //---\
    void getStronger(int strength);//--- state methods
    void display();//-------------------/*/
}
