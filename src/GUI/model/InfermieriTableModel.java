package GUI.model;

import EJB.Motra;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class InfermieriTableModel extends AbstractTableModel{

    public String [] columnName = {"id","Emri", "Mbiemri", "Gjinia", "Data lindjes"};
    List<Motra> data;
    
    public InfermieriTableModel() {
    }

    public InfermieriTableModel(List<Motra> lista){
        data = lista;
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
        Motra m = (Motra)data.get(rowIndex);
        
        switch(columnIndex)
        {
            case 0:
                return m.getId();
            case 1:
                return m.getEmri();
            case 2:
                return m.getMbiemri();
            case 3:
                return m.getGjinia();
            case 4:
                return m.getDataLindjes();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int col) {
      return columnName[col];
    }
    
    public Motra getMotra(int row)
    {
        return data.get(row);
    }
    
    public void remove(int row)
    {
        data.remove(row);
    }
    
    public void add(List<Motra> list)
    {
        data = list;
    }
}
