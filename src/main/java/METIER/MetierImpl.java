package METIER;

import DAO.IDao;

public class MetierImpl implements Imetier{
    IDao dao;
    @Override
    public int calcul() {
        int value=dao.getData();
        return value  ;
    }
    public void setDao(IDao dao){
            this.dao=dao;
    }
}
