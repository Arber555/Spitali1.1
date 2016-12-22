package GUI.model;

import EJB.Dhoma;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class DhomaTableModel extends AbstractTableModel{

    public String [] columnName = {"id","Numri i dhomes", "Numri i shtratve", "Sektori"};
    List<Dhoma> data = null;
    
    public DhomaTableModel(){}
    
    public DhomaTableModel(List<Dhoma> list)
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
        Dhoma d = (Dhoma)data.get(rowIndex);
        
        switch(columnIndex)
        {
            case 0:
                return d.getId();
            case 1:
                return d.getNrdhomes();
            case 2:
                return d.getNrshtratve();
            case 3:
                return d.getSektoriID().getEmri();
            default:
                return null;
        }
    }

    public Dhoma getDhoma(int row)
    {
        return data.get(row);
    }
    
    public void remove(int row)
    {
        data.remove(row);
    }
    
    public void add(List<Dhoma> list)
    {
        data = list;
    }
}
