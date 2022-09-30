package hello.jdbc.connection;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import java.sql.Connection;
import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
class DBConnectionUtilTest {

    @Test
    void connection() throws Exception {
        // given
        Connection connection = DBConnectionUtil.getConnection();

        // then
        assertThat(connection).isNotNull();
    }
}
