/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.model;

import EJB.Pacienti;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Edmond
 */
public class PacientiTableModel extends AbstractTableModel
{
    private String [] columnName = {"Id", "Emri", "Mbiemri", "Gjinia", "Data lindjes"};
    public List<Pacienti> pacinetiList;
    
    public PacientiTableModel()
    {
    
    }
    
    public PacientiTableModel(List<Pacienti> list)
    {
        pacinetiList= list;
    }
    
    @Override
    public String getColumnName(int col) 
    {
        return columnName[col];
    }
    
    @Override
    public int getRowCount() {
        return pacinetiList.size();
    }
    
    @Override
    public int getColumnCount() {
        return columnName.length;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pacienti p = pacinetiList.get(rowIndex);
        
        switch(columnIndex)
        {
            case 0:
                return p.getId();
            case 1:
                return p.getEmri();
            case 2:
                return p.getMbiemri();
            case 3:
                return p.getGjinia();
            case 4:
                return p.getDataLindjes();
            default:
                return null;
        }
    }
    
    public Pacienti getPacienti(int row)
    {
        return pacinetiList.get(row);
    }
    
    public void remove(int row)
    {
        pacinetiList.remove(row);
    }
    
    public void add(List<Pacienti> list)
    {
        pacinetiList = list;
    }
}
