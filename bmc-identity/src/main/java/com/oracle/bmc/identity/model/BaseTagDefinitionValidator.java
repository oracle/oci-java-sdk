/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.model;

/**
 * Validates a definedTag value. Each validator performs validation steps in addition to the standard validation
 * for definedTag values (See [Limits on Tags](https://docs.cloud.oracle.com/Content/Identity/Concepts/taggingoverview.htm#Limits).
 * <p>
 * If a validator is defined after a value has been set for a definedTag, then any UPDATE operation that attempts
 * to change the value must pass the additional validation defined by this rule. Previously set values, that would
 * fail validation, are not updated and it is possible to update other attributes of an OCI resource that contains
 * a non-valid definedTag.
 * <p>
 * To clear the validator call the UPDATE operation with DefaultTagDefinitionValidator.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "validatorType",
    defaultImpl = BaseTagDefinitionValidator.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DefaultTagDefinitionValidator.class,
        name = "DEFAULT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = EnumTagDefinitionValidator.class,
        name = "ENUM"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class BaseTagDefinitionValidator {}
