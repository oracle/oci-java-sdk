/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * The information about the members of Exadata system to be added. If memberEntityDetails is not specified, the the Enterprise Manager entity (e.g. databases and hosts) associated with an Exadata system will be placed in the same compartment as the Exadata system.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AddEmManagedExternalExadataInsightMembersDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "entitySource"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AddEmManagedExternalExadataInsightMembersDetails
        extends AddExadataInsightMembersDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("memberEntityDetails")
        private java.util.List<CreateEmManagedExternalExadataMemberEntityDetails>
                memberEntityDetails;

        public Builder memberEntityDetails(
                java.util.List<CreateEmManagedExternalExadataMemberEntityDetails>
                        memberEntityDetails) {
            this.memberEntityDetails = memberEntityDetails;
            this.__explicitlySet__.add("memberEntityDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddEmManagedExternalExadataInsightMembersDetails build() {
            AddEmManagedExternalExadataInsightMembersDetails __instance__ =
                    new AddEmManagedExternalExadataInsightMembersDetails(memberEntityDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddEmManagedExternalExadataInsightMembersDetails o) {
            Builder copiedBuilder = memberEntityDetails(o.getMemberEntityDetails());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    @Deprecated
    public AddEmManagedExternalExadataInsightMembersDetails(
            java.util.List<CreateEmManagedExternalExadataMemberEntityDetails> memberEntityDetails) {
        super();
        this.memberEntityDetails = memberEntityDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("memberEntityDetails")
    java.util.List<CreateEmManagedExternalExadataMemberEntityDetails> memberEntityDetails;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
