/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client;

import java.util.Map;
import java.util.Set;

/** Capabilities that an HTTP client library may support. */
public enum StandardHttpProviderCapability implements HttpProviderCapability {
    /**
     * This capability indicates that the HTTP provider can handle parameterized endpoints. This
     * means that the endpoints can contain placeholders in the format
     *
     * <ol>
     *   <li>"{parameterName}
     *   <li>"{parameterName+Dot}
     *   <li>"{optionName?trueValue:falseValue}"
     * </ol>
     *
     * where "parameterName" is the name of one of the required parameter of the operation being
     * invoked; and where "optionName" is an option name, and "trueValue" is the literal replacement
     * string it the option is enabled, and "falseValue" is the literal replacement string if the
     * option is false. If the option is unknown, the entire construct is removed, meaning neither
     * true nor the false replacement value is added.
     *
     * <p>If an HTTP provider has this capability, the oci-java-sdk-common library will call the
     * {@link HttpClient#createRequest(Method, Map, Map)} and provide a map of required parameters
     * to their parameter values, and map of options to their Boolean value.
     *
     * <p>If an HTTP provider does NOT have this capability, then the {@link
     * HttpClient#createRequest(Method)} will be called instead.
     */
    PARAMETERIZED_ENDPOINTS;
}
