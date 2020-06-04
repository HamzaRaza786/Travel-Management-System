class cCostTax {
    public double mcTax = 0.90;
    
    public double cFindTax(double cAmount)
    {
        double FindTax = cAmount - (cAmount * mcTax);    
        return FindTax;
    }
}
