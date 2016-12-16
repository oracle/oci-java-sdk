/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.requests;

import java.io.*;
import java.util.*;

import lombok.Builder;
import lombok.Getter;
import lombok.experimental.Accessors;

import com.oracle.bmc.model.*;
import com.oracle.bmc.core.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Builder(builderClassName = "Builder")
@Getter
public class GetConsoleHistoryRequest {

    /**
     * The OCID of the console history.
     */
    private String instanceConsoleHistoryId;
}
