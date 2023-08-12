package ai.chat2db.server.web.api.controller.rdb.request;

import java.io.Serial;

import ai.chat2db.server.web.api.controller.data.source.request.DataSourceBaseRequestInfo;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ProcedureDetailRequest implements DataSourceBaseRequestInfo {

    @Serial
    private static final long serialVersionUID = -364547173428396332L;
    /**
     * 数据源id
     */
    @NotNull
    private Long dataSourceId;
    /**
     * DB名称
     */
    private String databaseName;

    /**
     * 表所在空间，pg,oracle需要，mysql不需要
     */
    private String schemaName;

    /**
     * procedure name
     */
    private String procedureName;

    /**
     * if true, refresh the cache
     */
    private boolean refresh;
}
