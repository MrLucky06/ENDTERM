import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface LibraryMemberRepository extends JpaRepository<LibraryMember, Integer> {
    List<LibraryMember> findByName(String name);
}
