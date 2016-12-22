package GUI.model;

import EJB.Barnat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class BarnatTableModel extends AbstractTableModel{

    public String [] columnName = {"id","Ermi", "Data skadimit", "Cmimi", "Pershkrimi komponenteve"};
    List<Barnat> data = null;
    
    public BarnatTableModel(){}
    
    public BarnatTableModel(List<Barnat> list)
    {
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
        Barnat b = (Barnat)data.get(rowIndex);
        
        switch(columnIndex)
        {
            case 0:
                return b.getId();
            case 1:
                return b.getEmri();
            case 2:
                return b.getDataSkadimit();
            case 3:
                return b.getCmimi();
            case 4:
                return b.getCmimi();
            case 5:
                return b.getPershkrimiKomponenteve();
            default:
                return null;
        }
    }
    
    public Barnat getBarna(int row)
    {
        return data.get(row);
    }
    
    public void remove(int row)
    {
        data.remove(row);
    }
    
    public void add(List<Barnat> list)
    {
        data = list;
    }
}
