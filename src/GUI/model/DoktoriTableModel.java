package GUI.model;

import EJB.Doktori;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class DoktoriTableModel extends AbstractTableModel{
    public String [] columnName = {"id","Emri", "Mbiemri", "Gjinia", "Data lindjes", "Specjalizimi"};
    List<Doktori> data;
    
    public DoktoriTableModel()
    {
     
    }
    
    public DoktoriTableModel(List<Doktori> list){
        data = list;
    }
    
    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public String getColumnName(int col) {
      return columnName[col];
    }
    
    @Override
    public int getColumnCount() {
        return columnName.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Doktori d = (Doktori)data.get(rowIndex);
        
        switch(columnIndex)
        {
            case 0:
                return d.getId();
            case 1:
                return d.getEmri();
            case 2:
                return d.getMbiemri();
            case 3:
                return d.getGjinia();
            case 4:
                return d.getDataLindjes();
            case 5:
                return d.getSpecializimi();
            default:
                return null;
        }
    }
    
    public Doktori getDoktori(int row)
    {
        return data.get(row);
    }
    
    public void remove(int row)
    {
        data.remove(row);
    }
    
    public void add(List<Doktori> list)
    {
        data = list;
    }
}