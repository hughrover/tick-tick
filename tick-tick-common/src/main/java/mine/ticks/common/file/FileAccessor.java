package mine.ticks.common.file;

public class FileAccessor {
    private String fileAccessorName;
    private IncrementReader reader;
    private IncrementWriter writer;

    public FileAccessor() {
        reader = new IncrementReader();
        writer = new IncrementWriter();
    }

    public String getReaderInfo() {
        return reader.getIncrementReaderInfo();
    }

    public String getWriterInfo() {
        return writer.getIncrementWriterInfo();
    }

    public String getFileAccessorName() {
        return fileAccessorName;
    }

    public void setFileAccessorName(String fileAccessorName) {
        this.fileAccessorName = fileAccessorName;
    }
}
