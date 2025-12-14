import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.File;
import java.util.List;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) throws Exception {
        // CSV Reading
        File csvFile = new File(Main.class.getClassLoader().getResource("monthlycsv.csv").toURI());
        CSVReader reader = new CSVReader(new FileReader(csvFile));
        List<String[]> csvRows = reader.readAll();
        reader.close();

        // PDF Reading
        File pdfFile = new File(Main.class.getClassLoader().getResource("monthlypdf.pdf").toURI());
        PDDocument document = PDDocument.load(pdfFile);
        PDFTextStripper pdfStripper = new PDFTextStripper();
        String pdfText = pdfStripper.getText(document);
        document.close();

        System.out.println(pdfText); // check
    }
}
