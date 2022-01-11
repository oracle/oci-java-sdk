/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.applicationmigration.model;

/**
 * Base model for different application discovery requirements.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191031")
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = DiscoveryDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = OicDiscoveryDetails.class,
        name = "OIC"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = PcsDiscoveryDetails.class,
        name = "PCS"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = IcsDiscoveryDetails.class,
        name = "ICS"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = OacDiscoveryDetails.class,
        name = "OAC"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = JcsDiscoveryDetails.class,
        name = "JCS"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = SoacsDiscoveryDetails.class,
        name = "SOACS"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class DiscoveryDetails {}
