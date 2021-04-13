/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The attachment type from which the DRG will import routes. Routes will be imported from
 * all attachments of this type.
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
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DrgAttachmentTypeDrgRouteDistributionMatchCriteria.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "matchType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DrgAttachmentTypeDrgRouteDistributionMatchCriteria
        extends DrgRouteDistributionMatchCriteria {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("attachmentType")
        private AttachmentType attachmentType;

        public Builder attachmentType(AttachmentType attachmentType) {
            this.attachmentType = attachmentType;
            this.__explicitlySet__.add("attachmentType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DrgAttachmentTypeDrgRouteDistributionMatchCriteria build() {
            DrgAttachmentTypeDrgRouteDistributionMatchCriteria __instance__ =
                    new DrgAttachmentTypeDrgRouteDistributionMatchCriteria(attachmentType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DrgAttachmentTypeDrgRouteDistributionMatchCriteria o) {
            Builder copiedBuilder = attachmentType(o.getAttachmentType());

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
    public DrgAttachmentTypeDrgRouteDistributionMatchCriteria(AttachmentType attachmentType) {
        super();
        this.attachmentType = attachmentType;
    }

    /**
     * The type of the network resource to be included in this match. A match for a network type implies that all
     * DRG attachments of that type insert routes into the table.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum AttachmentType {
        Vcn("VCN"),
        VirtualCircuit("VIRTUAL_CIRCUIT"),
        RemotePeeringConnection("REMOTE_PEERING_CONNECTION"),
        IpsecTunnel("IPSEC_TUNNEL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, AttachmentType> map;

        static {
            map = new java.util.HashMap<>();
            for (AttachmentType v : AttachmentType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AttachmentType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AttachmentType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AttachmentType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of the network resource to be included in this match. A match for a network type implies that all
     * DRG attachments of that type insert routes into the table.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attachmentType")
    AttachmentType attachmentType;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
