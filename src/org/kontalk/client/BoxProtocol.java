// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: txprotobuf.proto

package org.kontalk.client;

public final class BoxProtocol {
  private BoxProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface BoxContainerOrBuilder
      extends com.google.protobuf.MessageLiteOrBuilder {
    
    // required string name = 1;
    boolean hasName();
    String getName();
    
    // required bytes value = 2;
    boolean hasValue();
    com.google.protobuf.ByteString getValue();
    
    // optional string tx_id = 3;
    boolean hasTxId();
    String getTxId();
  }
  public static final class BoxContainer extends
      com.google.protobuf.GeneratedMessageLite
      implements BoxContainerOrBuilder {
    // Use BoxContainer.newBuilder() to construct.
    private BoxContainer(Builder builder) {
      super(builder);
    }
    private BoxContainer(boolean noInit) {}
    
    private static final BoxContainer defaultInstance;
    public static BoxContainer getDefaultInstance() {
      return defaultInstance;
    }
    
    public BoxContainer getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    private int bitField0_;
    // required string name = 1;
    public static final int NAME_FIELD_NUMBER = 1;
    private java.lang.Object name_;
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          name_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required bytes value = 2;
    public static final int VALUE_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString value_;
    public boolean hasValue() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public com.google.protobuf.ByteString getValue() {
      return value_;
    }
    
    // optional string tx_id = 3;
    public static final int TX_ID_FIELD_NUMBER = 3;
    private java.lang.Object txId_;
    public boolean hasTxId() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public String getTxId() {
      java.lang.Object ref = txId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          txId_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getTxIdBytes() {
      java.lang.Object ref = txId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        txId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      name_ = "";
      value_ = com.google.protobuf.ByteString.EMPTY;
      txId_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasValue()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, value_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getTxIdBytes());
      }
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, value_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getTxIdBytes());
      }
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static org.kontalk.client.BoxProtocol.BoxContainer parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.kontalk.client.BoxProtocol.BoxContainer parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.kontalk.client.BoxProtocol.BoxContainer parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.kontalk.client.BoxProtocol.BoxContainer parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.kontalk.client.BoxProtocol.BoxContainer parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.kontalk.client.BoxProtocol.BoxContainer parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static org.kontalk.client.BoxProtocol.BoxContainer parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.kontalk.client.BoxProtocol.BoxContainer parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.kontalk.client.BoxProtocol.BoxContainer parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.kontalk.client.BoxProtocol.BoxContainer parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.kontalk.client.BoxProtocol.BoxContainer prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          org.kontalk.client.BoxProtocol.BoxContainer, Builder>
        implements org.kontalk.client.BoxProtocol.BoxContainerOrBuilder {
      // Construct using org.kontalk.client.BoxProtocol.BoxContainer.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private void maybeForceBuilderInitialization() {
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        value_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        txId_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public org.kontalk.client.BoxProtocol.BoxContainer getDefaultInstanceForType() {
        return org.kontalk.client.BoxProtocol.BoxContainer.getDefaultInstance();
      }
      
      public org.kontalk.client.BoxProtocol.BoxContainer build() {
        org.kontalk.client.BoxProtocol.BoxContainer result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private org.kontalk.client.BoxProtocol.BoxContainer buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        org.kontalk.client.BoxProtocol.BoxContainer result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public org.kontalk.client.BoxProtocol.BoxContainer buildPartial() {
        org.kontalk.client.BoxProtocol.BoxContainer result = new org.kontalk.client.BoxProtocol.BoxContainer(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.value_ = value_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.txId_ = txId_;
        result.bitField0_ = to_bitField0_;
        return result;
      }
      
      public Builder mergeFrom(org.kontalk.client.BoxProtocol.BoxContainer other) {
        if (other == org.kontalk.client.BoxProtocol.BoxContainer.getDefaultInstance()) return this;
        if (other.hasName()) {
          setName(other.getName());
        }
        if (other.hasValue()) {
          setValue(other.getValue());
        }
        if (other.hasTxId()) {
          setTxId(other.getTxId());
        }
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasName()) {
          
          return false;
        }
        if (!hasValue()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              
              return this;
            default: {
              if (!parseUnknownField(input, extensionRegistry, tag)) {
                
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              name_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              value_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              txId_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string name = 1;
      private java.lang.Object name_ = "";
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setName(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        
        return this;
      }
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = getDefaultInstance().getName();
        
        return this;
      }
      void setName(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        name_ = value;
        
      }
      
      // required bytes value = 2;
      private com.google.protobuf.ByteString value_ = com.google.protobuf.ByteString.EMPTY;
      public boolean hasValue() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public com.google.protobuf.ByteString getValue() {
        return value_;
      }
      public Builder setValue(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        value_ = value;
        
        return this;
      }
      public Builder clearValue() {
        bitField0_ = (bitField0_ & ~0x00000002);
        value_ = getDefaultInstance().getValue();
        
        return this;
      }
      
      // optional string tx_id = 3;
      private java.lang.Object txId_ = "";
      public boolean hasTxId() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public String getTxId() {
        java.lang.Object ref = txId_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          txId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setTxId(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        txId_ = value;
        
        return this;
      }
      public Builder clearTxId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        txId_ = getDefaultInstance().getTxId();
        
        return this;
      }
      void setTxId(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000004;
        txId_ = value;
        
      }
      
      // @@protoc_insertion_point(builder_scope:BoxContainer)
    }
    
    static {
      defaultInstance = new BoxContainer(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:BoxContainer)
  }
  
  
  static {
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
