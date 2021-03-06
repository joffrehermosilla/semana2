package bootcamp.microservices.app.clientaccounttypes.documents;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Document
public class ClientAccountType implements Serializable {

	private static final long serialVersionUID = 7140924174384966341L;

	private String id;

	private String completeName;

	private String shortName;

	private Double mainteanceCost;

	private Integer operationsNumber;

	private Date operationDate;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date createDate;

	private String createUser;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date modifyDate;

	private String modifyUser;

	private Integer status;

}
