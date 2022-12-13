package design.strategy.example.convert;

import java.io.*;

/**
 * 类描述：
 *
 * @author cfl
 * @version 1.0
 * @date 2022/12/12 16:20
 */
public class Cell implements ICloneable<Cell> {
    private int row;
    private int column;
    private String contents;

    public Cell(int row, int column, String contents) {
        this.row = row;
        this.column = column;
        this.contents = contents;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "row=" + row +
                ", column=" + column +
                ", contents='" + contents + '\'' +
                '}';
    }


}
