/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Properties that are required to create a Digital Assistant.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "kind",
    defaultImpl = CreateDigitalAssistantDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateDigitalAssistantVersionDetails.class,
        name = "VERSION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CloneDigitalAssistantDetails.class,
        name = "CLONE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateNewDigitalAssistantDetails.class,
        name = "NEW"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ExtendDigitalAssistantDetails.class,
        name = "EXTEND"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateDigitalAssistantDetails {

    /**
     * The resource's category.  This is used to group resource's together.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    String category;

    /**
     * A short description of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The ODA Platform Version for this resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("platformVersion")
    String platformVersion;

    /**
     * The multilingual mode for the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("multilingualMode")
    BotMultilingualMode multilingualMode;

    /**
     * The primary language for the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("primaryLanguageTag")
    String primaryLanguageTag;

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;
}
