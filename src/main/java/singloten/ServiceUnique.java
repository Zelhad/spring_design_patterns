package singloten;

import org.springframework.stereotype.Service;

@Service

public class ServiceUnique {
	private static java.util.logging.Logger log =java.util.logging.Logger.getLogger(ServiceUnique.class.getName());

	private int status = 0;

	public synchronized int incEtat() {
		// Long operation
		return ++status;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	void  dsispayStatus() {
		log.info("The status is " +status);
		
	}

	@Override
	public int hashCode() {
		final int prime = 31 ;
		int result = 1;
		result = prime * result + status ;
		return result ;
		
		
	}

	@Override
	public boolean equals(Object obj) {
		ServiceUnique other = (ServiceUnique)obj;
		if(status != other.getStatus())
		return false ;
		return true ;
	}

	@Override
	public String toString() {
		return "ServiceUnique [status=" + status + "]";
	}



}
