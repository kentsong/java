package note.pattern.structural.Facade;

import note.pattern.structural.Facade.sample.IComponent;
import note.pattern.structural.Facade.sample.component.FacebookComponent;
import note.pattern.structural.Facade.sample.component.GoogleComponent;

/**
 * �Y�t�λݨϥβĤT��api(�Τ���),��X�@�ӤJ�f�]Facade�^�����A����{���w���̿��{�b�虜������@�W
 * �p�G���ε{�������ϥΤF�{���w���Ҵ��Ѫ��U��API�A�]�N�O���ε{�������P�{���w���F���׽��X�A
 * �N�ӵ{���w���ʡA�z�����ε{�����P �ӵ{���w���������A���n�@�@��X�ק�A�p�G���Ӧ��󴫵{���w���i��ʡA�o�س]�p�覡��M�a���ɥ����@�X�j�T�ק�C
 * 
 * Facade�Ҧ����äF�U�Ӥ��󤧶����X�@�欰�A�H�Τ��󥻨����ާ@�P�]�w�Ӹ`�A�T�ӥ����h�F�@�Ǫ����ާ@���󪺤�K�ʡA
 * �ҥH�����w�l�D �P�ާ@�Ӹ`���{���]�p�H���Ө��A���|�ܳ��w�z�LFacade�Ӿާ@�I�᪺����A�ҥH�z��Facade�����]�p�A�q�`�n�b����̿�ʤΤ��󪺤䱵�ާ@�ʤ��� �@�ӥ��šC
 * 
 * @author 635_kentsong
 */
public class FacadeClient {

	public static void main(String[] args) {
		
		IComponent googleComponent = new GoogleComponent();
		googleComponent.doService();
		
		IComponent facebookComponent = new FacebookComponent();
		facebookComponent.doService();
	}

}
