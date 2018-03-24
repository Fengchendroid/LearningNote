/**
 * java.io包中定义了多个流类型
 * 按数据处理流的方向不同可以分为输入流和输出流。
 * 按数据处理单位不同可以分为字节流和字符流。
 * 按照功能不同可以分为节点流和处理流。
 */ 
@继承自InptStream的流都是用于向程序中输入数据且数据的单位为字节。
	@int read() throws IOException
	@int read(byte[] buffer) throws IOException
	@int read(byte[] buffer,int offset,int length) throws IOException
	@void close() throws IOException
	@long skip(long n) throws IOException
@继承自OutptStream的流都是用于向程序中输出数据且数据的单位为字节。
	@int write() throws IOException
	@int write(byte[] buffer) throws IOException
	@int write(byte[] buffer,int offset,int length) throws IOException
	@void close() throws IOException
	@long fiush(long n) throws IOException
@继承自Reader的流都是用于向程序中读入数据且数据的单位为字符。
	@int read() throws IOException
	@int read(char[] cbuf) throws IOException
	@int read(char[] cbuf,int offset,int length) throws IOException
	@void close() throws IOException
	@long skip(long n) throws IOException
@继承自writer的流都是用于向程序中写出数据且数据的单位为字符。
	@int write() throws IOException
	@int write(char[] cbuf) throws IOException
	@int write(char[] cbuf,int offset,int length) throws IOException
	@int write(String string) throws IOException
	@int write(String string,int offset,int length) throws IOException
	@void close() throws IOException
	@long fiush(long n) throws IOException
@BufferWriter、BufferReader缓冲流很重要
@OutputStreamWirter,InputStreamWriter()转换流
//例子：FileOutputStream o=new FileOutputStream("d:\\**",true);true代表在**后添加内容