package weaver.interfaces.gx.jyl.ceb2pdf;

public interface WaitService {

	public String StatusChange(String serialID, String status, String pdfFileName, String ErrorCode, String RequestID, String PDFDocName, String WarnTimeFlag);
}
