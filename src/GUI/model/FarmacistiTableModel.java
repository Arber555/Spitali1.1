package GUI.model;

import EJB.Farmacisti;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class FarmacistiTableModel extends AbstractTableModel{

    private String [] columnName = {"id","Emri", "Mbiemri", "Gjinia", "Data lindjes"};
    private List<Farmacisti> data;
    
    public FarmacistiTableModel(){}
    
    public FarmacistiTableModel(List<Farmacisti> list)
    {
        data = list;
    }
    
    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return columnName.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Farmacisti f = (Farmacisti)data.get(rowIndex);
        
        switch(columnIndex)
        {
            case 0:
                return f.getId();
            case 1:
                return f.getEmri();
            case 2:
                return f.getMbiemri();
            case 3:
                return f.getGjinia();
            case 4:
                return f.getDataLindjes();
            default:
                return null;
        }
    }
    
    public Farmacisti getFarmacisti(int row)
    {
        return data.get(row);
    }
    
    public void remove(int row)
    {
        data.remove(row);
    }
    
    public void add(List<Farmacisti> list)
    {
        data = list;
    }
}
