package weaver.interfaces.gx.jyl.convert;

/**
 * 敏行 报告转换结果 接口
 * @author Administrator
 *
 */
public interface ReportResultPDF {
	
	/**
	 * 接收 任务执行结果
	 * @param nJobid 任务id
	 * @param strXML 结果 xml
	 * @return
	 */
	public int convertResult(int nJobid, String strXML);
	
	/**
	 * 获取任务执行结果
	 * @param nJobid 任务id
	 * @return
	 */
	public String getJobResult(int nJobid);

}
