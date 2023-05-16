/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The detailed information about a particular CPE device type. Compare with {@link
 * CpeDeviceShapeSummary}. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CpeDeviceShapeDetail.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CpeDeviceShapeDetail
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "cpeDeviceShapeId",
        "cpeDeviceInfo",
        "parameters",
        "template"
    })
    public CpeDeviceShapeDetail(
            String cpeDeviceShapeId,
            CpeDeviceInfo cpeDeviceInfo,
            java.util.List<CpeDeviceConfigQuestion> parameters,
            String template) {
        super();
        this.cpeDeviceShapeId = cpeDeviceShapeId;
        this.cpeDeviceInfo = cpeDeviceInfo;
        this.parameters = parameters;
        this.template = template;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the CPE device shape. This value uniquely identifies the type of CPE device.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cpeDeviceShapeId")
        private String cpeDeviceShapeId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the CPE device shape. This value uniquely identifies the type of CPE device.
         *
         * @param cpeDeviceShapeId the value to set
         * @return this builder
         */
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
        /**
         * For certain CPE devices types, the customer can provide answers to questions that are
         * specific to the device type. This attribute contains a list of those questions. The
         * Networking service merges the answers with other information and renders a set of CPE
         * configuration content. To provide the answers, use {@link
         * #updateTunnelCpeDeviceConfig(UpdateTunnelCpeDeviceConfigRequest)
         * updateTunnelCpeDeviceConfig}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.List<CpeDeviceConfigQuestion> parameters;

        /**
         * For certain CPE devices types, the customer can provide answers to questions that are
         * specific to the device type. This attribute contains a list of those questions. The
         * Networking service merges the answers with other information and renders a set of CPE
         * configuration content. To provide the answers, use {@link
         * #updateTunnelCpeDeviceConfig(UpdateTunnelCpeDeviceConfigRequest)
         * updateTunnelCpeDeviceConfig}.
         *
         * @param parameters the value to set
         * @return this builder
         */
        public Builder parameters(java.util.List<CpeDeviceConfigQuestion> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }
        /**
         * A template of CPE device configuration information that will be merged with the
         * customer's answers to the questions to render the final CPE device configuration content.
         * Also see:
         *
         * <p>{@link #getCpeDeviceConfigContent(GetCpeDeviceConfigContentRequest)
         * getCpeDeviceConfigContent} * {@link
         * #getIpsecCpeDeviceConfigContent(GetIpsecCpeDeviceConfigContentRequest)
         * getIpsecCpeDeviceConfigContent} * {@link
         * #getTunnelCpeDeviceConfigContent(GetTunnelCpeDeviceConfigContentRequest)
         * getTunnelCpeDeviceConfigContent}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("template")
        private String template;

        /**
         * A template of CPE device configuration information that will be merged with the
         * customer's answers to the questions to render the final CPE device configuration content.
         * Also see:
         *
         * <p>{@link #getCpeDeviceConfigContent(GetCpeDeviceConfigContentRequest)
         * getCpeDeviceConfigContent} * {@link
         * #getIpsecCpeDeviceConfigContent(GetIpsecCpeDeviceConfigContentRequest)
         * getIpsecCpeDeviceConfigContent} * {@link
         * #getTunnelCpeDeviceConfigContent(GetTunnelCpeDeviceConfigContentRequest)
         * getTunnelCpeDeviceConfigContent}
         *
         * @param template the value to set
         * @return this builder
         */
        public Builder template(String template) {
            this.template = template;
            this.__explicitlySet__.add("template");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CpeDeviceShapeDetail build() {
            CpeDeviceShapeDetail model =
                    new CpeDeviceShapeDetail(
                            this.cpeDeviceShapeId,
                            this.cpeDeviceInfo,
                            this.parameters,
                            this.template);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CpeDeviceShapeDetail model) {
            if (model.wasPropertyExplicitlySet("cpeDeviceShapeId")) {
                this.cpeDeviceShapeId(model.getCpeDeviceShapeId());
            }
            if (model.wasPropertyExplicitlySet("cpeDeviceInfo")) {
                this.cpeDeviceInfo(model.getCpeDeviceInfo());
            }
            if (model.wasPropertyExplicitlySet("parameters")) {
                this.parameters(model.getParameters());
            }
            if (model.wasPropertyExplicitlySet("template")) {
                this.template(model.getTemplate());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the CPE device shape. This value uniquely identifies the type of CPE device.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cpeDeviceShapeId")
    private final String cpeDeviceShapeId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the CPE device shape. This value uniquely identifies the type of CPE device.
     *
     * @return the value
     */
    public String getCpeDeviceShapeId() {
        return cpeDeviceShapeId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("cpeDeviceInfo")
    private final CpeDeviceInfo cpeDeviceInfo;

    public CpeDeviceInfo getCpeDeviceInfo() {
        return cpeDeviceInfo;
    }

    /**
     * For certain CPE devices types, the customer can provide answers to questions that are
     * specific to the device type. This attribute contains a list of those questions. The
     * Networking service merges the answers with other information and renders a set of CPE
     * configuration content. To provide the answers, use {@link
     * #updateTunnelCpeDeviceConfig(UpdateTunnelCpeDeviceConfigRequest)
     * updateTunnelCpeDeviceConfig}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    private final java.util.List<CpeDeviceConfigQuestion> parameters;

    /**
     * For certain CPE devices types, the customer can provide answers to questions that are
     * specific to the device type. This attribute contains a list of those questions. The
     * Networking service merges the answers with other information and renders a set of CPE
     * configuration content. To provide the answers, use {@link
     * #updateTunnelCpeDeviceConfig(UpdateTunnelCpeDeviceConfigRequest)
     * updateTunnelCpeDeviceConfig}.
     *
     * @return the value
     */
    public java.util.List<CpeDeviceConfigQuestion> getParameters() {
        return parameters;
    }

    /**
     * A template of CPE device configuration information that will be merged with the customer's
     * answers to the questions to render the final CPE device configuration content. Also see:
     *
     * <p>{@link #getCpeDeviceConfigContent(GetCpeDeviceConfigContentRequest)
     * getCpeDeviceConfigContent} * {@link
     * #getIpsecCpeDeviceConfigContent(GetIpsecCpeDeviceConfigContentRequest)
     * getIpsecCpeDeviceConfigContent} * {@link
     * #getTunnelCpeDeviceConfigContent(GetTunnelCpeDeviceConfigContentRequest)
     * getTunnelCpeDeviceConfigContent}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("template")
    private final String template;

    /**
     * A template of CPE device configuration information that will be merged with the customer's
     * answers to the questions to render the final CPE device configuration content. Also see:
     *
     * <p>{@link #getCpeDeviceConfigContent(GetCpeDeviceConfigContentRequest)
     * getCpeDeviceConfigContent} * {@link
     * #getIpsecCpeDeviceConfigContent(GetIpsecCpeDeviceConfigContentRequest)
     * getIpsecCpeDeviceConfigContent} * {@link
     * #getTunnelCpeDeviceConfigContent(GetTunnelCpeDeviceConfigContentRequest)
     * getTunnelCpeDeviceConfigContent}
     *
     * @return the value
     */
    public String getTemplate() {
        return template;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CpeDeviceShapeDetail(");
        sb.append("super=").append(super.toString());
        sb.append("cpeDeviceShapeId=").append(String.valueOf(this.cpeDeviceShapeId));
        sb.append(", cpeDeviceInfo=").append(String.valueOf(this.cpeDeviceInfo));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
        sb.append(", template=").append(String.valueOf(this.template));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CpeDeviceShapeDetail)) {
            return false;
        }

        CpeDeviceShapeDetail other = (CpeDeviceShapeDetail) o;
        return java.util.Objects.equals(this.cpeDeviceShapeId, other.cpeDeviceShapeId)
                && java.util.Objects.equals(this.cpeDeviceInfo, other.cpeDeviceInfo)
                && java.util.Objects.equals(this.parameters, other.parameters)
                && java.util.Objects.equals(this.template, other.template)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.cpeDeviceShapeId == null ? 43 : this.cpeDeviceShapeId.hashCode());
        result =
                (result * PRIME)
                        + (this.cpeDeviceInfo == null ? 43 : this.cpeDeviceInfo.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        result = (result * PRIME) + (this.template == null ? 43 : this.template.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
