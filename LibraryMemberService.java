import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LibraryMemberService {

    @Autowired
    private LibraryMemberRepository libraryMemberRepository;

    public List<LibraryMember> getAllMembers() {
        return libraryMemberRepository.findAll();
    }

    public LibraryMember getMemberById(int id) {
        return libraryMemberRepository.findById(id).orElse(null);
    }

    public void addMember(LibraryMember member) {
        libraryMemberRepository.save(member);
    }

    public void updateMember(int id, LibraryMember member) {
        if (libraryMemberRepository.existsById(id)) {
            member.setMemberId(id);
            libraryMemberRepository.save(member);
        }
    }

    public void deleteMember(int id) {
        libraryMemberRepository.deleteById(id);
    }
}
