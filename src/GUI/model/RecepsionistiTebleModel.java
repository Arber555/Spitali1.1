package GUI.model;

import EJB.Rescepsionisti;
import java.util.List;
import javax.swing.table.AbstractTableModel;



public class RecepsionistiTebleModel extends AbstractTableModel{

    public String [] columnName = {"id","Emri", "Mbiemri", "Gjinia", "Data lindjes"};
    List<Rescepsionisti> data;
    
    public RecepsionistiTebleModel(){}
    
    public RecepsionistiTebleModel(List<Rescepsionisti> list)
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
        Rescepsionisti d = (Rescepsionisti)data.get(rowIndex);
        
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
            default:
                return null;
        }
    }
    
    public Rescepsionisti getRecepsionisti(int row)
    {
        return data.get(row);
    }
    
    public void remove(int row)
    {
        data.remove(row);
    }
    
    public void add(List<Rescepsionisti> list)
    {
        data = list;
    }
}
