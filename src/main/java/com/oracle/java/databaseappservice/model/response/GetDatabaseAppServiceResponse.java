package com.oracle.java.databaseappservice.model.response;

import java.util.List;
import com.oracle.java.databaseappservice.model.vo.GroupDatabaseAppServiceResponse;

import lombok.Data;

@Data
public class GetDatabaseAppServiceResponse {
	
	private List<GroupDatabaseAppServiceResponse> items;

}
