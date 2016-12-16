/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.requests;

import java.io.*;
import java.util.*;

import lombok.Builder;
import lombok.Getter;
import lombok.experimental.Accessors;

import com.oracle.bmc.model.*;
import com.oracle.bmc.identity.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Builder(builderClassName = "Builder")
@Getter
public class ListUserGroupMembershipsRequest {

    /**
     * The OCID of the compartment (remember that the tenancy is simply the root compartment).
     *
     */
    private String compartmentId;

    /**
     * The OCID of the user.
     */
    private String userId;

    /**
     * The OCID of the group.
     */
    private String groupId;

    /**
     * The value of the `opc-next-page` response header from the previous \"List\" call.
     *
     */
    private String page;

    /**
     * The maximum number of items to return in a paginated \"List\" call.
     *
     */
    private Integer limit;
}
