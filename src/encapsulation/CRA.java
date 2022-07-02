package encapsulation;

public class CRA {

	// Added by Athira
	// instanceOf
	int CRAId;
	boolean isCRA;

	CRA(int CRAId) {
		this.CRAId = CRAId;
	}

	boolean CheckCRA() {
		if (CRAId == 11111 || CRAId == 33333) {
			isCRA = true;
		}
		return isCRA;
	}
}