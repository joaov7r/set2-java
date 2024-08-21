package entities;

import java.util.Objects;

public class Students {

	private Integer code;

	public Students(Integer code) {
		this.code = code;
	}

	public Integer getCode() {
		return code;
	}

	@Override
	public int hashCode() {
		return Objects.hash(code);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		return Objects.equals(code, other.code);
	}	
}
