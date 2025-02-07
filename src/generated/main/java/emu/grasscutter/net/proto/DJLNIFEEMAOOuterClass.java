// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DJLNIFEEMAO.proto

package emu.grasscutter.net.proto;

public final class DJLNIFEEMAOOuterClass {
  private DJLNIFEEMAOOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DJLNIFEEMAOOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DJLNIFEEMAO)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.AvatarInfo avatar_info = 3;</code>
     * @return Whether the avatarInfo field is set.
     */
    boolean hasAvatarInfo();
    /**
     * <code>.AvatarInfo avatar_info = 3;</code>
     * @return The avatarInfo.
     */
    emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo getAvatarInfo();
    /**
     * <code>.AvatarInfo avatar_info = 3;</code>
     */
    emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfoOrBuilder getAvatarInfoOrBuilder();

    /**
     * <code>uint32 player_uid = 10;</code>
     * @return The playerUid.
     */
    int getPlayerUid();

    /**
     * <code>optional .IIKMMGPBEMC FMPENOILMND = 1105;</code>
     * @return Whether the fMPENOILMND field is set.
     */
    boolean hasFMPENOILMND();
    /**
     * <code>optional .IIKMMGPBEMC FMPENOILMND = 1105;</code>
     * @return The fMPENOILMND.
     */
    emu.grasscutter.net.proto.IIKMMGPBEMCOuterClass.IIKMMGPBEMC getFMPENOILMND();
    /**
     * <code>optional .IIKMMGPBEMC FMPENOILMND = 1105;</code>
     */
    emu.grasscutter.net.proto.IIKMMGPBEMCOuterClass.IIKMMGPBEMCOrBuilder getFMPENOILMNDOrBuilder();
  }
  /**
   * Protobuf type {@code DJLNIFEEMAO}
   */
  public static final class DJLNIFEEMAO extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DJLNIFEEMAO)
      DJLNIFEEMAOOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DJLNIFEEMAO.newBuilder() to construct.
    private DJLNIFEEMAO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DJLNIFEEMAO() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DJLNIFEEMAO();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DJLNIFEEMAO(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 26: {
              emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.Builder subBuilder = null;
              if (avatarInfo_ != null) {
                subBuilder = avatarInfo_.toBuilder();
              }
              avatarInfo_ = input.readMessage(emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(avatarInfo_);
                avatarInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            case 80: {

              playerUid_ = input.readUInt32();
              break;
            }
            case 8842: {
              emu.grasscutter.net.proto.IIKMMGPBEMCOuterClass.IIKMMGPBEMC.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = fMPENOILMND_.toBuilder();
              }
              fMPENOILMND_ = input.readMessage(emu.grasscutter.net.proto.IIKMMGPBEMCOuterClass.IIKMMGPBEMC.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(fMPENOILMND_);
                fMPENOILMND_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.internal_static_DJLNIFEEMAO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.internal_static_DJLNIFEEMAO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.DJLNIFEEMAO.class, emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.DJLNIFEEMAO.Builder.class);
    }

    private int bitField0_;
    public static final int AVATAR_INFO_FIELD_NUMBER = 3;
    private emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo avatarInfo_;
    /**
     * <code>.AvatarInfo avatar_info = 3;</code>
     * @return Whether the avatarInfo field is set.
     */
    @java.lang.Override
    public boolean hasAvatarInfo() {
      return avatarInfo_ != null;
    }
    /**
     * <code>.AvatarInfo avatar_info = 3;</code>
     * @return The avatarInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo getAvatarInfo() {
      return avatarInfo_ == null ? emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.getDefaultInstance() : avatarInfo_;
    }
    /**
     * <code>.AvatarInfo avatar_info = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfoOrBuilder getAvatarInfoOrBuilder() {
      return getAvatarInfo();
    }

    public static final int PLAYER_UID_FIELD_NUMBER = 10;
    private int playerUid_;
    /**
     * <code>uint32 player_uid = 10;</code>
     * @return The playerUid.
     */
    @java.lang.Override
    public int getPlayerUid() {
      return playerUid_;
    }

    public static final int FMPENOILMND_FIELD_NUMBER = 1105;
    private emu.grasscutter.net.proto.IIKMMGPBEMCOuterClass.IIKMMGPBEMC fMPENOILMND_;
    /**
     * <code>optional .IIKMMGPBEMC FMPENOILMND = 1105;</code>
     * @return Whether the fMPENOILMND field is set.
     */
    @java.lang.Override
    public boolean hasFMPENOILMND() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .IIKMMGPBEMC FMPENOILMND = 1105;</code>
     * @return The fMPENOILMND.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.IIKMMGPBEMCOuterClass.IIKMMGPBEMC getFMPENOILMND() {
      return fMPENOILMND_ == null ? emu.grasscutter.net.proto.IIKMMGPBEMCOuterClass.IIKMMGPBEMC.getDefaultInstance() : fMPENOILMND_;
    }
    /**
     * <code>optional .IIKMMGPBEMC FMPENOILMND = 1105;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.IIKMMGPBEMCOuterClass.IIKMMGPBEMCOrBuilder getFMPENOILMNDOrBuilder() {
      return fMPENOILMND_ == null ? emu.grasscutter.net.proto.IIKMMGPBEMCOuterClass.IIKMMGPBEMC.getDefaultInstance() : fMPENOILMND_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (avatarInfo_ != null) {
        output.writeMessage(3, getAvatarInfo());
      }
      if (playerUid_ != 0) {
        output.writeUInt32(10, playerUid_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(1105, getFMPENOILMND());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (avatarInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getAvatarInfo());
      }
      if (playerUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, playerUid_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1105, getFMPENOILMND());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.DJLNIFEEMAO)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.DJLNIFEEMAO other = (emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.DJLNIFEEMAO) obj;

      if (hasAvatarInfo() != other.hasAvatarInfo()) return false;
      if (hasAvatarInfo()) {
        if (!getAvatarInfo()
            .equals(other.getAvatarInfo())) return false;
      }
      if (getPlayerUid()
          != other.getPlayerUid()) return false;
      if (hasFMPENOILMND() != other.hasFMPENOILMND()) return false;
      if (hasFMPENOILMND()) {
        if (!getFMPENOILMND()
            .equals(other.getFMPENOILMND())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasAvatarInfo()) {
        hash = (37 * hash) + AVATAR_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getAvatarInfo().hashCode();
      }
      hash = (37 * hash) + PLAYER_UID_FIELD_NUMBER;
      hash = (53 * hash) + getPlayerUid();
      if (hasFMPENOILMND()) {
        hash = (37 * hash) + FMPENOILMND_FIELD_NUMBER;
        hash = (53 * hash) + getFMPENOILMND().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.DJLNIFEEMAO parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.DJLNIFEEMAO parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.DJLNIFEEMAO parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.DJLNIFEEMAO parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.DJLNIFEEMAO parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.DJLNIFEEMAO parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.DJLNIFEEMAO parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.DJLNIFEEMAO parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.DJLNIFEEMAO parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.DJLNIFEEMAO parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.DJLNIFEEMAO parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.DJLNIFEEMAO parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.DJLNIFEEMAO prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code DJLNIFEEMAO}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DJLNIFEEMAO)
        emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.DJLNIFEEMAOOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.internal_static_DJLNIFEEMAO_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.internal_static_DJLNIFEEMAO_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.DJLNIFEEMAO.class, emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.DJLNIFEEMAO.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.DJLNIFEEMAO.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getFMPENOILMNDFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (avatarInfoBuilder_ == null) {
          avatarInfo_ = null;
        } else {
          avatarInfo_ = null;
          avatarInfoBuilder_ = null;
        }
        playerUid_ = 0;

        if (fMPENOILMNDBuilder_ == null) {
          fMPENOILMND_ = null;
        } else {
          fMPENOILMNDBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.internal_static_DJLNIFEEMAO_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.DJLNIFEEMAO getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.DJLNIFEEMAO.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.DJLNIFEEMAO build() {
        emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.DJLNIFEEMAO result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.DJLNIFEEMAO buildPartial() {
        emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.DJLNIFEEMAO result = new emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.DJLNIFEEMAO(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (avatarInfoBuilder_ == null) {
          result.avatarInfo_ = avatarInfo_;
        } else {
          result.avatarInfo_ = avatarInfoBuilder_.build();
        }
        result.playerUid_ = playerUid_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          if (fMPENOILMNDBuilder_ == null) {
            result.fMPENOILMND_ = fMPENOILMND_;
          } else {
            result.fMPENOILMND_ = fMPENOILMNDBuilder_.build();
          }
          to_bitField0_ |= 0x00000001;
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.DJLNIFEEMAO) {
          return mergeFrom((emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.DJLNIFEEMAO)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.DJLNIFEEMAO other) {
        if (other == emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.DJLNIFEEMAO.getDefaultInstance()) return this;
        if (other.hasAvatarInfo()) {
          mergeAvatarInfo(other.getAvatarInfo());
        }
        if (other.getPlayerUid() != 0) {
          setPlayerUid(other.getPlayerUid());
        }
        if (other.hasFMPENOILMND()) {
          mergeFMPENOILMND(other.getFMPENOILMND());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.DJLNIFEEMAO parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.DJLNIFEEMAO) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo avatarInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo, emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.Builder, emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfoOrBuilder> avatarInfoBuilder_;
      /**
       * <code>.AvatarInfo avatar_info = 3;</code>
       * @return Whether the avatarInfo field is set.
       */
      public boolean hasAvatarInfo() {
        return avatarInfoBuilder_ != null || avatarInfo_ != null;
      }
      /**
       * <code>.AvatarInfo avatar_info = 3;</code>
       * @return The avatarInfo.
       */
      public emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo getAvatarInfo() {
        if (avatarInfoBuilder_ == null) {
          return avatarInfo_ == null ? emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.getDefaultInstance() : avatarInfo_;
        } else {
          return avatarInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.AvatarInfo avatar_info = 3;</code>
       */
      public Builder setAvatarInfo(emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo value) {
        if (avatarInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          avatarInfo_ = value;
          onChanged();
        } else {
          avatarInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.AvatarInfo avatar_info = 3;</code>
       */
      public Builder setAvatarInfo(
          emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.Builder builderForValue) {
        if (avatarInfoBuilder_ == null) {
          avatarInfo_ = builderForValue.build();
          onChanged();
        } else {
          avatarInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.AvatarInfo avatar_info = 3;</code>
       */
      public Builder mergeAvatarInfo(emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo value) {
        if (avatarInfoBuilder_ == null) {
          if (avatarInfo_ != null) {
            avatarInfo_ =
              emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.newBuilder(avatarInfo_).mergeFrom(value).buildPartial();
          } else {
            avatarInfo_ = value;
          }
          onChanged();
        } else {
          avatarInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.AvatarInfo avatar_info = 3;</code>
       */
      public Builder clearAvatarInfo() {
        if (avatarInfoBuilder_ == null) {
          avatarInfo_ = null;
          onChanged();
        } else {
          avatarInfo_ = null;
          avatarInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.AvatarInfo avatar_info = 3;</code>
       */
      public emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.Builder getAvatarInfoBuilder() {
        
        onChanged();
        return getAvatarInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.AvatarInfo avatar_info = 3;</code>
       */
      public emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfoOrBuilder getAvatarInfoOrBuilder() {
        if (avatarInfoBuilder_ != null) {
          return avatarInfoBuilder_.getMessageOrBuilder();
        } else {
          return avatarInfo_ == null ?
              emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.getDefaultInstance() : avatarInfo_;
        }
      }
      /**
       * <code>.AvatarInfo avatar_info = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo, emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.Builder, emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfoOrBuilder> 
          getAvatarInfoFieldBuilder() {
        if (avatarInfoBuilder_ == null) {
          avatarInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo, emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.Builder, emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfoOrBuilder>(
                  getAvatarInfo(),
                  getParentForChildren(),
                  isClean());
          avatarInfo_ = null;
        }
        return avatarInfoBuilder_;
      }

      private int playerUid_ ;
      /**
       * <code>uint32 player_uid = 10;</code>
       * @return The playerUid.
       */
      @java.lang.Override
      public int getPlayerUid() {
        return playerUid_;
      }
      /**
       * <code>uint32 player_uid = 10;</code>
       * @param value The playerUid to set.
       * @return This builder for chaining.
       */
      public Builder setPlayerUid(int value) {
        
        playerUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 player_uid = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlayerUid() {
        
        playerUid_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.IIKMMGPBEMCOuterClass.IIKMMGPBEMC fMPENOILMND_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.IIKMMGPBEMCOuterClass.IIKMMGPBEMC, emu.grasscutter.net.proto.IIKMMGPBEMCOuterClass.IIKMMGPBEMC.Builder, emu.grasscutter.net.proto.IIKMMGPBEMCOuterClass.IIKMMGPBEMCOrBuilder> fMPENOILMNDBuilder_;
      /**
       * <code>optional .IIKMMGPBEMC FMPENOILMND = 1105;</code>
       * @return Whether the fMPENOILMND field is set.
       */
      public boolean hasFMPENOILMND() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional .IIKMMGPBEMC FMPENOILMND = 1105;</code>
       * @return The fMPENOILMND.
       */
      public emu.grasscutter.net.proto.IIKMMGPBEMCOuterClass.IIKMMGPBEMC getFMPENOILMND() {
        if (fMPENOILMNDBuilder_ == null) {
          return fMPENOILMND_ == null ? emu.grasscutter.net.proto.IIKMMGPBEMCOuterClass.IIKMMGPBEMC.getDefaultInstance() : fMPENOILMND_;
        } else {
          return fMPENOILMNDBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .IIKMMGPBEMC FMPENOILMND = 1105;</code>
       */
      public Builder setFMPENOILMND(emu.grasscutter.net.proto.IIKMMGPBEMCOuterClass.IIKMMGPBEMC value) {
        if (fMPENOILMNDBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          fMPENOILMND_ = value;
          onChanged();
        } else {
          fMPENOILMNDBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .IIKMMGPBEMC FMPENOILMND = 1105;</code>
       */
      public Builder setFMPENOILMND(
          emu.grasscutter.net.proto.IIKMMGPBEMCOuterClass.IIKMMGPBEMC.Builder builderForValue) {
        if (fMPENOILMNDBuilder_ == null) {
          fMPENOILMND_ = builderForValue.build();
          onChanged();
        } else {
          fMPENOILMNDBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .IIKMMGPBEMC FMPENOILMND = 1105;</code>
       */
      public Builder mergeFMPENOILMND(emu.grasscutter.net.proto.IIKMMGPBEMCOuterClass.IIKMMGPBEMC value) {
        if (fMPENOILMNDBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
              fMPENOILMND_ != null &&
              fMPENOILMND_ != emu.grasscutter.net.proto.IIKMMGPBEMCOuterClass.IIKMMGPBEMC.getDefaultInstance()) {
            fMPENOILMND_ =
              emu.grasscutter.net.proto.IIKMMGPBEMCOuterClass.IIKMMGPBEMC.newBuilder(fMPENOILMND_).mergeFrom(value).buildPartial();
          } else {
            fMPENOILMND_ = value;
          }
          onChanged();
        } else {
          fMPENOILMNDBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .IIKMMGPBEMC FMPENOILMND = 1105;</code>
       */
      public Builder clearFMPENOILMND() {
        if (fMPENOILMNDBuilder_ == null) {
          fMPENOILMND_ = null;
          onChanged();
        } else {
          fMPENOILMNDBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>optional .IIKMMGPBEMC FMPENOILMND = 1105;</code>
       */
      public emu.grasscutter.net.proto.IIKMMGPBEMCOuterClass.IIKMMGPBEMC.Builder getFMPENOILMNDBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getFMPENOILMNDFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .IIKMMGPBEMC FMPENOILMND = 1105;</code>
       */
      public emu.grasscutter.net.proto.IIKMMGPBEMCOuterClass.IIKMMGPBEMCOrBuilder getFMPENOILMNDOrBuilder() {
        if (fMPENOILMNDBuilder_ != null) {
          return fMPENOILMNDBuilder_.getMessageOrBuilder();
        } else {
          return fMPENOILMND_ == null ?
              emu.grasscutter.net.proto.IIKMMGPBEMCOuterClass.IIKMMGPBEMC.getDefaultInstance() : fMPENOILMND_;
        }
      }
      /**
       * <code>optional .IIKMMGPBEMC FMPENOILMND = 1105;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.IIKMMGPBEMCOuterClass.IIKMMGPBEMC, emu.grasscutter.net.proto.IIKMMGPBEMCOuterClass.IIKMMGPBEMC.Builder, emu.grasscutter.net.proto.IIKMMGPBEMCOuterClass.IIKMMGPBEMCOrBuilder> 
          getFMPENOILMNDFieldBuilder() {
        if (fMPENOILMNDBuilder_ == null) {
          fMPENOILMNDBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.IIKMMGPBEMCOuterClass.IIKMMGPBEMC, emu.grasscutter.net.proto.IIKMMGPBEMCOuterClass.IIKMMGPBEMC.Builder, emu.grasscutter.net.proto.IIKMMGPBEMCOuterClass.IIKMMGPBEMCOrBuilder>(
                  getFMPENOILMND(),
                  getParentForChildren(),
                  isClean());
          fMPENOILMND_ = null;
        }
        return fMPENOILMNDBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:DJLNIFEEMAO)
    }

    // @@protoc_insertion_point(class_scope:DJLNIFEEMAO)
    private static final emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.DJLNIFEEMAO DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.DJLNIFEEMAO();
    }

    public static emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.DJLNIFEEMAO getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DJLNIFEEMAO>
        PARSER = new com.google.protobuf.AbstractParser<DJLNIFEEMAO>() {
      @java.lang.Override
      public DJLNIFEEMAO parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DJLNIFEEMAO(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DJLNIFEEMAO> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DJLNIFEEMAO> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DJLNIFEEMAOOuterClass.DJLNIFEEMAO getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DJLNIFEEMAO_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DJLNIFEEMAO_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021DJLNIFEEMAO.proto\032\020AvatarInfo.proto\032\021I" +
      "IKMMGPBEMC.proto\"|\n\013DJLNIFEEMAO\022 \n\013avata" +
      "r_info\030\003 \001(\0132\013.AvatarInfo\022\022\n\nplayer_uid\030" +
      "\n \001(\r\022\'\n\013FMPENOILMND\030\321\010 \001(\0132\014.IIKMMGPBEM" +
      "CH\000\210\001\001B\016\n\014_FMPENOILMNDB\033\n\031emu.grasscutte" +
      "r.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.AvatarInfoOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.IIKMMGPBEMCOuterClass.getDescriptor(),
        });
    internal_static_DJLNIFEEMAO_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DJLNIFEEMAO_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DJLNIFEEMAO_descriptor,
        new java.lang.String[] { "AvatarInfo", "PlayerUid", "FMPENOILMND", "FMPENOILMND", });
    emu.grasscutter.net.proto.AvatarInfoOuterClass.getDescriptor();
    emu.grasscutter.net.proto.IIKMMGPBEMCOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
