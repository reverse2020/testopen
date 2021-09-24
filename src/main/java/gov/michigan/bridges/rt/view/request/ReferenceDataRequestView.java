package gov.michigan.bridges.rt.view.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReferenceDataRequestView {

	private String tableName;
	private String code;
	private String key;

}
