/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaisandbox.model;

/**
 * Request body used to create a sandbox. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateSandboxDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateSandboxDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "warmpoolName",
        "source",
        "displayName",
        "runtime",
        "shape",
        "publishedPortAuthMode",
        "publishPorts",
        "expiresInMinutes",
        "expirationDuration",
        "environmentVariables",
        "credentialProfileLabel"
    })
    public CreateSandboxDetails(
            String warmpoolName,
            SandboxSource source,
            String displayName,
            String runtime,
            Sandbox.Shape shape,
            Sandbox.PublishedPortAuthMode publishedPortAuthMode,
            java.util.List<String> publishPorts,
            Integer expiresInMinutes,
            String expirationDuration,
            java.util.List<EnvironmentVariable> environmentVariables,
            String credentialProfileLabel) {
        super();
        this.warmpoolName = warmpoolName;
        this.source = source;
        this.displayName = displayName;
        this.runtime = runtime;
        this.shape = shape;
        this.publishedPortAuthMode = publishedPortAuthMode;
        this.publishPorts = publishPorts;
        this.expiresInMinutes = expiresInMinutes;
        this.expirationDuration = expirationDuration;
        this.environmentVariables = environmentVariables;
        this.credentialProfileLabel = credentialProfileLabel;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of a MANAGED or CUSTOM warm pool in the owning project. Runtime and shape are
         * derived from the pool; explicit values must match. Deleting pools cannot be used.
         * Snapshot restore, credential brokerage, and nested resource principals are not supported
         * with named pools. An empty pool may cold-create using its same template, including when
         * desired capacity is zero. Zero capacity stops idle prewarming; it does not prevent
         * creation from an available applied template. When warmpoolName is omitted, a built-in
         * runtime can automatically select an eligible named MANAGED pool in the same project
         * matching its runtime and shape. Omitted runtime defaults to python-3.11 and omitted shape
         * defaults to SMALL for automatic matching. A digest-pinned customer image can
         * automatically select an eligible CUSTOM pool in the same project matching its canonical
         * registry host, repository, digest and shape. Tag-based customer images are not
         * automatically matched. Matching pools are considered in name order; the first with a
         * valid applied template is selected without reading ready counts. Empty pools and zero
         * desired or applied capacity still allow cold creation through the selected template. If
         * no eligible pool is found or automatic lookup is unavailable, built-in runtimes use the
         * existing managed runtime path, and customer images use the ordinary direct customer-image
         * path with its existing validation. Automatic matching does not apply when source is
         * supplied, including snapshot restore, or when credential brokerage or nested resource
         * principals are used. Explicit names retain strict validation and do not fall back to
         * automatic matching or another creation path. Retries preserve the original persisted pool
         * binding or the original managed or direct customer-image route, even when matching pools
         * change. Sandbox and SandboxSummary report an automatically selected pool in warmpoolName.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("warmpoolName")
        private String warmpoolName;

        /**
         * Name of a MANAGED or CUSTOM warm pool in the owning project. Runtime and shape are
         * derived from the pool; explicit values must match. Deleting pools cannot be used.
         * Snapshot restore, credential brokerage, and nested resource principals are not supported
         * with named pools. An empty pool may cold-create using its same template, including when
         * desired capacity is zero. Zero capacity stops idle prewarming; it does not prevent
         * creation from an available applied template. When warmpoolName is omitted, a built-in
         * runtime can automatically select an eligible named MANAGED pool in the same project
         * matching its runtime and shape. Omitted runtime defaults to python-3.11 and omitted shape
         * defaults to SMALL for automatic matching. A digest-pinned customer image can
         * automatically select an eligible CUSTOM pool in the same project matching its canonical
         * registry host, repository, digest and shape. Tag-based customer images are not
         * automatically matched. Matching pools are considered in name order; the first with a
         * valid applied template is selected without reading ready counts. Empty pools and zero
         * desired or applied capacity still allow cold creation through the selected template. If
         * no eligible pool is found or automatic lookup is unavailable, built-in runtimes use the
         * existing managed runtime path, and customer images use the ordinary direct customer-image
         * path with its existing validation. Automatic matching does not apply when source is
         * supplied, including snapshot restore, or when credential brokerage or nested resource
         * principals are used. Explicit names retain strict validation and do not fall back to
         * automatic matching or another creation path. Retries preserve the original persisted pool
         * binding or the original managed or direct customer-image route, even when matching pools
         * change. Sandbox and SandboxSummary report an automatically selected pool in warmpoolName.
         *
         * @param warmpoolName the value to set
         * @return this builder
         */
        public Builder warmpoolName(String warmpoolName) {
            this.warmpoolName = warmpoolName;
            this.__explicitlySet__.add("warmpoolName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private SandboxSource source;

        public Builder source(SandboxSource source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }
        /** User-provided display name for the sandbox. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * User-provided display name for the sandbox.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Runtime identifier for the sandbox, either a built-in runtime such as python-3.11 or a
         * same-region Oracle Cloud Infrastructure Registry customer image reference.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("runtime")
        private String runtime;

        /**
         * Runtime identifier for the sandbox, either a built-in runtime such as python-3.11 or a
         * same-region Oracle Cloud Infrastructure Registry customer image reference.
         *
         * @param runtime the value to set
         * @return this builder
         */
        public Builder runtime(String runtime) {
            this.runtime = runtime;
            this.__explicitlySet__.add("runtime");
            return this;
        }
        /** Compute shape for the sandbox. */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private Sandbox.Shape shape;

        /**
         * Compute shape for the sandbox.
         *
         * @param shape the value to set
         * @return this builder
         */
        public Builder shape(Sandbox.Shape shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /**
         * Authorization for all published-port HTTP requests and WebSocket handshakes. OCI_IAM
         * requires Sandbox use and project read permission on the owning project. Omission defaults
         * to OCI_IAM for new sandboxes with published ports in enabled tenancies; elsewhere
         * omission retains legacy behavior. Explicit OCI_IAM outside the rollout, null, unsupported
         * values, or a mode without published ports are rejected. The effective mode is immutable
         * and is preserved when restoring protected snapshots.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("publishedPortAuthMode")
        private Sandbox.PublishedPortAuthMode publishedPortAuthMode;

        /**
         * Authorization for all published-port HTTP requests and WebSocket handshakes. OCI_IAM
         * requires Sandbox use and project read permission on the owning project. Omission defaults
         * to OCI_IAM for new sandboxes with published ports in enabled tenancies; elsewhere
         * omission retains legacy behavior. Explicit OCI_IAM outside the rollout, null, unsupported
         * values, or a mode without published ports are rejected. The effective mode is immutable
         * and is preserved when restoring protected snapshots.
         *
         * @param publishedPortAuthMode the value to set
         * @return this builder
         */
        public Builder publishedPortAuthMode(Sandbox.PublishedPortAuthMode publishedPortAuthMode) {
            this.publishedPortAuthMode = publishedPortAuthMode;
            this.__explicitlySet__.add("publishedPortAuthMode");
            return this;
        }
        /** Published ports to expose for the sandbox. */
        @com.fasterxml.jackson.annotation.JsonProperty("publishPorts")
        private java.util.List<String> publishPorts;

        /**
         * Published ports to expose for the sandbox.
         *
         * @param publishPorts the value to set
         * @return this builder
         */
        public Builder publishPorts(java.util.List<String> publishPorts) {
            this.publishPorts = publishPorts;
            this.__explicitlySet__.add("publishPorts");
            return this;
        }
        /**
         * Number of minutes from creation until automatic sandbox expiration. Use {@code -1} to
         * disable automatic expiration.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("expiresInMinutes")
        private Integer expiresInMinutes;

        /**
         * Number of minutes from creation until automatic sandbox expiration. Use {@code -1} to
         * disable automatic expiration.
         *
         * @param expiresInMinutes the value to set
         * @return this builder
         */
        public Builder expiresInMinutes(Integer expiresInMinutes) {
            this.expiresInMinutes = expiresInMinutes;
            this.__explicitlySet__.add("expiresInMinutes");
            return this;
        }
        /**
         * Deprecated. Use {@code expiresInMinutes} instead. Existing clients may pass {@code -1} to
         * disable automatic expiration.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("expirationDuration")
        private String expirationDuration;

        /**
         * Deprecated. Use {@code expiresInMinutes} instead. Existing clients may pass {@code -1} to
         * disable automatic expiration.
         *
         * @param expirationDuration the value to set
         * @return this builder
         */
        public Builder expirationDuration(String expirationDuration) {
            this.expirationDuration = expirationDuration;
            this.__explicitlySet__.add("expirationDuration");
            return this;
        }
        /** Environment variables to inject into the sandbox runtime. */
        @com.fasterxml.jackson.annotation.JsonProperty("environmentVariables")
        private java.util.List<EnvironmentVariable> environmentVariables;

        /**
         * Environment variables to inject into the sandbox runtime.
         *
         * @param environmentVariables the value to set
         * @return this builder
         */
        public Builder environmentVariables(
                java.util.List<EnvironmentVariable> environmentVariables) {
            this.environmentVariables = environmentVariables;
            this.__explicitlySet__.add("environmentVariables");
            return this;
        }
        /**
         * The Project credential profile selected for this Sandbox. Omit this field to select no
         * credential profile. The selection and its configuration snapshot are immutable for the
         * lifetime of the Sandbox; later Project profile updates apply only to subsequently created
         * Sandboxes after configuration propagation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("credentialProfileLabel")
        private String credentialProfileLabel;

        /**
         * The Project credential profile selected for this Sandbox. Omit this field to select no
         * credential profile. The selection and its configuration snapshot are immutable for the
         * lifetime of the Sandbox; later Project profile updates apply only to subsequently created
         * Sandboxes after configuration propagation.
         *
         * @param credentialProfileLabel the value to set
         * @return this builder
         */
        public Builder credentialProfileLabel(String credentialProfileLabel) {
            this.credentialProfileLabel = credentialProfileLabel;
            this.__explicitlySet__.add("credentialProfileLabel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateSandboxDetails build() {
            CreateSandboxDetails model =
                    new CreateSandboxDetails(
                            this.warmpoolName,
                            this.source,
                            this.displayName,
                            this.runtime,
                            this.shape,
                            this.publishedPortAuthMode,
                            this.publishPorts,
                            this.expiresInMinutes,
                            this.expirationDuration,
                            this.environmentVariables,
                            this.credentialProfileLabel);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSandboxDetails model) {
            if (model.wasPropertyExplicitlySet("warmpoolName")) {
                this.warmpoolName(model.getWarmpoolName());
            }
            if (model.wasPropertyExplicitlySet("source")) {
                this.source(model.getSource());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("runtime")) {
                this.runtime(model.getRuntime());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("publishedPortAuthMode")) {
                this.publishedPortAuthMode(model.getPublishedPortAuthMode());
            }
            if (model.wasPropertyExplicitlySet("publishPorts")) {
                this.publishPorts(model.getPublishPorts());
            }
            if (model.wasPropertyExplicitlySet("expiresInMinutes")) {
                this.expiresInMinutes(model.getExpiresInMinutes());
            }
            if (model.wasPropertyExplicitlySet("expirationDuration")) {
                this.expirationDuration(model.getExpirationDuration());
            }
            if (model.wasPropertyExplicitlySet("environmentVariables")) {
                this.environmentVariables(model.getEnvironmentVariables());
            }
            if (model.wasPropertyExplicitlySet("credentialProfileLabel")) {
                this.credentialProfileLabel(model.getCredentialProfileLabel());
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
     * Name of a MANAGED or CUSTOM warm pool in the owning project. Runtime and shape are derived
     * from the pool; explicit values must match. Deleting pools cannot be used. Snapshot restore,
     * credential brokerage, and nested resource principals are not supported with named pools. An
     * empty pool may cold-create using its same template, including when desired capacity is zero.
     * Zero capacity stops idle prewarming; it does not prevent creation from an available applied
     * template. When warmpoolName is omitted, a built-in runtime can automatically select an
     * eligible named MANAGED pool in the same project matching its runtime and shape. Omitted
     * runtime defaults to python-3.11 and omitted shape defaults to SMALL for automatic matching. A
     * digest-pinned customer image can automatically select an eligible CUSTOM pool in the same
     * project matching its canonical registry host, repository, digest and shape. Tag-based
     * customer images are not automatically matched. Matching pools are considered in name order;
     * the first with a valid applied template is selected without reading ready counts. Empty pools
     * and zero desired or applied capacity still allow cold creation through the selected template.
     * If no eligible pool is found or automatic lookup is unavailable, built-in runtimes use the
     * existing managed runtime path, and customer images use the ordinary direct customer-image
     * path with its existing validation. Automatic matching does not apply when source is supplied,
     * including snapshot restore, or when credential brokerage or nested resource principals are
     * used. Explicit names retain strict validation and do not fall back to automatic matching or
     * another creation path. Retries preserve the original persisted pool binding or the original
     * managed or direct customer-image route, even when matching pools change. Sandbox and
     * SandboxSummary report an automatically selected pool in warmpoolName.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("warmpoolName")
    private final String warmpoolName;

    /**
     * Name of a MANAGED or CUSTOM warm pool in the owning project. Runtime and shape are derived
     * from the pool; explicit values must match. Deleting pools cannot be used. Snapshot restore,
     * credential brokerage, and nested resource principals are not supported with named pools. An
     * empty pool may cold-create using its same template, including when desired capacity is zero.
     * Zero capacity stops idle prewarming; it does not prevent creation from an available applied
     * template. When warmpoolName is omitted, a built-in runtime can automatically select an
     * eligible named MANAGED pool in the same project matching its runtime and shape. Omitted
     * runtime defaults to python-3.11 and omitted shape defaults to SMALL for automatic matching. A
     * digest-pinned customer image can automatically select an eligible CUSTOM pool in the same
     * project matching its canonical registry host, repository, digest and shape. Tag-based
     * customer images are not automatically matched. Matching pools are considered in name order;
     * the first with a valid applied template is selected without reading ready counts. Empty pools
     * and zero desired or applied capacity still allow cold creation through the selected template.
     * If no eligible pool is found or automatic lookup is unavailable, built-in runtimes use the
     * existing managed runtime path, and customer images use the ordinary direct customer-image
     * path with its existing validation. Automatic matching does not apply when source is supplied,
     * including snapshot restore, or when credential brokerage or nested resource principals are
     * used. Explicit names retain strict validation and do not fall back to automatic matching or
     * another creation path. Retries preserve the original persisted pool binding or the original
     * managed or direct customer-image route, even when matching pools change. Sandbox and
     * SandboxSummary report an automatically selected pool in warmpoolName.
     *
     * @return the value
     */
    public String getWarmpoolName() {
        return warmpoolName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("source")
    private final SandboxSource source;

    public SandboxSource getSource() {
        return source;
    }

    /** User-provided display name for the sandbox. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * User-provided display name for the sandbox.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Runtime identifier for the sandbox, either a built-in runtime such as python-3.11 or a
     * same-region Oracle Cloud Infrastructure Registry customer image reference.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("runtime")
    private final String runtime;

    /**
     * Runtime identifier for the sandbox, either a built-in runtime such as python-3.11 or a
     * same-region Oracle Cloud Infrastructure Registry customer image reference.
     *
     * @return the value
     */
    public String getRuntime() {
        return runtime;
    }

    /** Compute shape for the sandbox. */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final Sandbox.Shape shape;

    /**
     * Compute shape for the sandbox.
     *
     * @return the value
     */
    public Sandbox.Shape getShape() {
        return shape;
    }

    /**
     * Authorization for all published-port HTTP requests and WebSocket handshakes. OCI_IAM requires
     * Sandbox use and project read permission on the owning project. Omission defaults to OCI_IAM
     * for new sandboxes with published ports in enabled tenancies; elsewhere omission retains
     * legacy behavior. Explicit OCI_IAM outside the rollout, null, unsupported values, or a mode
     * without published ports are rejected. The effective mode is immutable and is preserved when
     * restoring protected snapshots.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("publishedPortAuthMode")
    private final Sandbox.PublishedPortAuthMode publishedPortAuthMode;

    /**
     * Authorization for all published-port HTTP requests and WebSocket handshakes. OCI_IAM requires
     * Sandbox use and project read permission on the owning project. Omission defaults to OCI_IAM
     * for new sandboxes with published ports in enabled tenancies; elsewhere omission retains
     * legacy behavior. Explicit OCI_IAM outside the rollout, null, unsupported values, or a mode
     * without published ports are rejected. The effective mode is immutable and is preserved when
     * restoring protected snapshots.
     *
     * @return the value
     */
    public Sandbox.PublishedPortAuthMode getPublishedPortAuthMode() {
        return publishedPortAuthMode;
    }

    /** Published ports to expose for the sandbox. */
    @com.fasterxml.jackson.annotation.JsonProperty("publishPorts")
    private final java.util.List<String> publishPorts;

    /**
     * Published ports to expose for the sandbox.
     *
     * @return the value
     */
    public java.util.List<String> getPublishPorts() {
        return publishPorts;
    }

    /**
     * Number of minutes from creation until automatic sandbox expiration. Use {@code -1} to disable
     * automatic expiration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("expiresInMinutes")
    private final Integer expiresInMinutes;

    /**
     * Number of minutes from creation until automatic sandbox expiration. Use {@code -1} to disable
     * automatic expiration.
     *
     * @return the value
     */
    public Integer getExpiresInMinutes() {
        return expiresInMinutes;
    }

    /**
     * Deprecated. Use {@code expiresInMinutes} instead. Existing clients may pass {@code -1} to
     * disable automatic expiration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("expirationDuration")
    private final String expirationDuration;

    /**
     * Deprecated. Use {@code expiresInMinutes} instead. Existing clients may pass {@code -1} to
     * disable automatic expiration.
     *
     * @return the value
     */
    public String getExpirationDuration() {
        return expirationDuration;
    }

    /** Environment variables to inject into the sandbox runtime. */
    @com.fasterxml.jackson.annotation.JsonProperty("environmentVariables")
    private final java.util.List<EnvironmentVariable> environmentVariables;

    /**
     * Environment variables to inject into the sandbox runtime.
     *
     * @return the value
     */
    public java.util.List<EnvironmentVariable> getEnvironmentVariables() {
        return environmentVariables;
    }

    /**
     * The Project credential profile selected for this Sandbox. Omit this field to select no
     * credential profile. The selection and its configuration snapshot are immutable for the
     * lifetime of the Sandbox; later Project profile updates apply only to subsequently created
     * Sandboxes after configuration propagation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("credentialProfileLabel")
    private final String credentialProfileLabel;

    /**
     * The Project credential profile selected for this Sandbox. Omit this field to select no
     * credential profile. The selection and its configuration snapshot are immutable for the
     * lifetime of the Sandbox; later Project profile updates apply only to subsequently created
     * Sandboxes after configuration propagation.
     *
     * @return the value
     */
    public String getCredentialProfileLabel() {
        return credentialProfileLabel;
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
        sb.append("CreateSandboxDetails(");
        sb.append("super=").append(super.toString());
        sb.append("warmpoolName=").append(String.valueOf(this.warmpoolName));
        sb.append(", source=").append(String.valueOf(this.source));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", runtime=").append(String.valueOf(this.runtime));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", publishedPortAuthMode=").append(String.valueOf(this.publishedPortAuthMode));
        sb.append(", publishPorts=").append(String.valueOf(this.publishPorts));
        sb.append(", expiresInMinutes=").append(String.valueOf(this.expiresInMinutes));
        sb.append(", expirationDuration=").append(String.valueOf(this.expirationDuration));
        sb.append(", environmentVariables=").append(String.valueOf(this.environmentVariables));
        sb.append(", credentialProfileLabel=").append(String.valueOf(this.credentialProfileLabel));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSandboxDetails)) {
            return false;
        }

        CreateSandboxDetails other = (CreateSandboxDetails) o;
        return java.util.Objects.equals(this.warmpoolName, other.warmpoolName)
                && java.util.Objects.equals(this.source, other.source)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.runtime, other.runtime)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.publishedPortAuthMode, other.publishedPortAuthMode)
                && java.util.Objects.equals(this.publishPorts, other.publishPorts)
                && java.util.Objects.equals(this.expiresInMinutes, other.expiresInMinutes)
                && java.util.Objects.equals(this.expirationDuration, other.expirationDuration)
                && java.util.Objects.equals(this.environmentVariables, other.environmentVariables)
                && java.util.Objects.equals(
                        this.credentialProfileLabel, other.credentialProfileLabel)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.warmpoolName == null ? 43 : this.warmpoolName.hashCode());
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.runtime == null ? 43 : this.runtime.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result =
                (result * PRIME)
                        + (this.publishedPortAuthMode == null
                                ? 43
                                : this.publishedPortAuthMode.hashCode());
        result = (result * PRIME) + (this.publishPorts == null ? 43 : this.publishPorts.hashCode());
        result =
                (result * PRIME)
                        + (this.expiresInMinutes == null ? 43 : this.expiresInMinutes.hashCode());
        result =
                (result * PRIME)
                        + (this.expirationDuration == null
                                ? 43
                                : this.expirationDuration.hashCode());
        result =
                (result * PRIME)
                        + (this.environmentVariables == null
                                ? 43
                                : this.environmentVariables.hashCode());
        result =
                (result * PRIME)
                        + (this.credentialProfileLabel == null
                                ? 43
                                : this.credentialProfileLabel.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
