import java.awt.event.*;
import javax.swing.*;

/** class ExitButton - 시스템을 종료하는 버튼 */
public class ExitButton extends JButton implements ActionListener {
	
	/** Constructor - 버튼 위에 표시될 문자 설정 및 ActionListener 설정 
	 * @param label - 버튼 위에 표시될 문자 */
	public ExitButton(String label) {
		super(label);
		addActionListener(this);
	}
	
	/** actionPerformed - ActionEvent 입력 시 시스템 종료  
	 * @param e - 버튼이 눌렸는지 알려줌*/
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

}
