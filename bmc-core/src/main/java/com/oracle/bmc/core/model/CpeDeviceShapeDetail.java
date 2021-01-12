/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The detailed information about a particular CPE device type. Compare with
 * {@link CpeDeviceShapeSummary}.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CpeDeviceShapeDetail.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CpeDeviceShapeDetail {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("cpeDeviceShapeId")
        private String cpeDeviceShapeId;

        public Builder cpeDeviceShapeId(String cpeDeviceShapeId) {
            this.cpeDeviceShapeId = cpeDeviceShapeId;
            this.__explicitlySet__.add("cpeDeviceShapeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpeDeviceInfo")
        private CpeDeviceInfo cpeDeviceInfo;

        public Builder cpeDeviceInfo(CpeDeviceInfo cpeDeviceInfo) {
            this.cpeDeviceInfo = cpeDeviceInfo;
            this.__explicitlySet__.add("cpeDeviceInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.List<CpeDeviceConfigQuestion> parameters;

        public Builder parameters(java.util.List<CpeDeviceConfigQuestion> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("template")
        private String template;

        public Builder template(String template) {
            this.template = template;
            this.__explicitlySet__.add("template");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CpeDeviceShapeDetail build() {
            CpeDeviceShapeDetail __instance__ =
                    new CpeDeviceShapeDetail(cpeDeviceShapeId, cpeDeviceInfo, parameters, template);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CpeDeviceShapeDetail o) {
            Builder copiedBuilder =
                    cpeDeviceShapeId(o.getCpeDeviceShapeId())
                            .cpeDeviceInfo(o.getCpeDeviceInfo())
                            .parameters(o.getParameters())
                            .template(o.getTemplate());

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

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the CPE device shape.
     * This value uniquely identifies the type of CPE device.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpeDeviceShapeId")
    String cpeDeviceShapeId;

    /**
     * Basic information about this particular CPE device type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpeDeviceInfo")
    CpeDeviceInfo cpeDeviceInfo;

    /**
     * For certain CPE devices types, the customer can provide answers to
     * questions that are specific to the device type. This attribute contains
     * a list of those questions. The Networking service merges the answers with
     * other information and renders a set of CPE configuration content. To
     * provide the answers, use
     * {@link #updateTunnelCpeDeviceConfig(UpdateTunnelCpeDeviceConfigRequest) updateTunnelCpeDeviceConfig}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    java.util.List<CpeDeviceConfigQuestion> parameters;

    /**
     * A template of CPE device configuration information that will be merged with the customer's
     * answers to the questions to render the final CPE device configuration content. Also see:
     * <p>
     * {@link #getCpeDeviceConfigContent(GetCpeDeviceConfigContentRequest) getCpeDeviceConfigContent}
     *   * {@link #getIpsecCpeDeviceConfigContent(GetIpsecCpeDeviceConfigContentRequest) getIpsecCpeDeviceConfigContent}
     *   * {@link #getTunnelCpeDeviceConfigContent(GetTunnelCpeDeviceConfigContentRequest) getTunnelCpeDeviceConfigContent}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("template")
    String template;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
