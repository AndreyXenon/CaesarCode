import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.*;
import org.testng.Assert;



public class TestMain {

    @ParameterizedTest()
    @CsvSource(value = {
            "aaabbb, cccddd",
            "kldsa, mnfuc",
            "pmf7f, roh7h",
            "ggg-ddf, iii-ffh"
    }, ignoreLeadingAndTrailingWhitespace = true)
    void testEncryption(String s, String res){
        Assert.assertEquals(res, main.Encryption(s, 2));
    }

    @ParameterizedTest()
    @CsvSource(value = {
            "aaabbb, cccddd",
            "kldsa, mnfuc",
            "pmf7f, roh7h",
            "ggg-ddf, iii-ffh"
    }, ignoreLeadingAndTrailingWhitespace = true)
    void testDecrypt(String res, String s){
        Assert.assertEquals(res, main.Decrypt(s, 2));
    }

}
